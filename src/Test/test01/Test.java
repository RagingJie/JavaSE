package Test.test01;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 * @Date 2024/9/24 9:53
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        FibMachineFbConfig fibMachineFbConfig = new FibMachineFbConfig();
        fibMachineFbConfig.setCreateTime(new Date());
        fibMachineFbConfig.setGiveConvertAmount(1);
        fibMachineFbConfig.setGiveMinimum(BigDecimal.ONE);
        fibMachineFbConfig.setIsGiveCredit((byte) 1);
        fibMachineFbConfig.setSpendConvertMoney(BigDecimal.valueOf(0.03));
        fibMachineFbConfig.setSpendMinimum(BigDecimal.ONE);
        fibMachineFbConfig.setIsSpendCredit((byte) 1);
        fibMachineFbConfig.setMaxRate(BigDecimal.valueOf(0.5));
        Map<String, Object> points = points(fibMachineFbConfig);
        System.out.println(points.toString());
    }


    public static Map<String, Object> points(FibMachineFbConfig integralRule) {

        BigDecimal payTotalPrices = BigDecimal.valueOf(2);

        int availableFb = 10;

        BigDecimal totalActualAmount = BigDecimal.ZERO;   // 订单应付总金额
        BigDecimal totalDeductedAmount = BigDecimal.ZERO; // 订单总抵扣金额
        Integer totalCoustFb = 0;   // 订单总消耗积分
        Integer totalGiveFbNum = 0; // 订单总赠送积分
        if (integralRule != null) {

            // 计算积分
            try {
                // 判断是否使用积分抵扣
                if (integralRule.getIsSpendCredit().equals((byte) 1)) { // 使用积分抵扣
                    // 支付金额是否满足抵扣门槛
                    if (integralRule.getSpendMinimum().compareTo(payTotalPrices) <= 0) { // 满足抵扣条件
                        // 获取最大支付金额所对应的积分数，并判断用户是否支持满抵
                        // 最大抵扣积分数
                        int maxDeductionIntegralNumber = payTotalPrices.multiply(integralRule.getMaxRate()).divide(integralRule.getSpendConvertMoney(), 2, RoundingMode.HALF_UP).setScale(0, RoundingMode.UP).intValue();
                        // 获取最大抵扣金额
                        BigDecimal maxDeductionPrice = payTotalPrices.multiply(integralRule.getMaxRate()).setScale(2, RoundingMode.FLOOR);
                        // 判断用户是否支持满抵
                        if (maxDeductionIntegralNumber <= availableFb) { // 可满抵扣
                            System.out.println("积分可满抵扣.......");
                            // 满抵时，最大抵扣积分数，就是订单总消耗积分
                            totalCoustFb = maxDeductionIntegralNumber;
                            // 总抵扣金额
                            totalDeductedAmount = maxDeductionPrice;
                            // 订单应付总金额
                            totalActualAmount = payTotalPrices.subtract(totalDeductedAmount);
                            // 赠送积分计算
                            // 判断是否赠送积分
                            if (integralRule.getIsGiveCredit().equals((byte) 1)) { // 赠送积分
                                // 判断是否达到赠送积分门槛
                                if (integralRule.getGiveMinimum().compareTo(totalActualAmount) <= 0) { // 满足赠送积分门槛
                                    // 总赠送积分
                                    totalGiveFbNum = totalActualAmount.setScale(0, RoundingMode.FLOOR).intValue() * integralRule.getGiveConvertAmount();
                                } else { // 不满足赠送积分门槛，不赠积分
                                    totalGiveFbNum = 0;
                                }
                            } else { // 不赠送积分
                                totalGiveFbNum = 0;
                            }
                        } else {  // 不可满抵，按照用户的积分数做最大抵扣
                            System.out.println("不可满抵，按照用户的积分数做最大抵扣.......");
                            // 计算用户的积分根据积分规则可抵扣多少钱
                            BigDecimal deductibleAmount = integralRule.getSpendConvertMoney().multiply(BigDecimal.valueOf(availableFb)).setScale(2, RoundingMode.FLOOR);
                            System.out.println("计算用户的积分根据积分规则可抵扣多少钱.......");
                            // 抵扣积分就是用户全部积分
                            totalCoustFb = availableFb;
                            // 抵扣金额
                            totalDeductedAmount = deductibleAmount;
                            // 订单应付总金额
                            totalActualAmount = payTotalPrices.subtract(totalDeductedAmount);
                            // 赠送积分计算
                            // 判断是否赠送积分
                            if (integralRule.getIsGiveCredit().equals((byte) 1)) { // 赠送积分
                                // 判断是否达到赠送积分门槛
                                if (integralRule.getGiveMinimum().compareTo(totalActualAmount) <= 0) { // 满足赠送积分门槛
                                    // 总赠送积分
                                    totalGiveFbNum = totalActualAmount.setScale(0, RoundingMode.FLOOR).intValue() * integralRule.getGiveConvertAmount();
                                } else { // 不满足赠送积分门槛，不赠积分
                                    totalGiveFbNum = 0;
                                }
                            } else { // 不赠送积分
                                totalGiveFbNum = 0;
                            }
                        }
                    } else { // 不满足抵扣条件
                        System.out.println("不满足积分抵扣条件.......");
                        // 不抵扣积分时，总消耗积分为0
                        totalCoustFb = 0;
                        // 总抵扣金额为0
                        totalDeductedAmount = BigDecimal.ZERO;
                        // 订单应付总金额
                        totalActualAmount = payTotalPrices;

                        // 判断是否赠送积分
                        if (integralRule.getIsGiveCredit().equals((byte) 1)) { // 赠送积分
                            // 判断是否达到赠送积分门槛
                            if (integralRule.getGiveMinimum().compareTo(totalActualAmount) <= 0) { // 满足赠送积分门槛
                                // 总赠送积分
                                totalGiveFbNum = totalActualAmount.setScale(0, RoundingMode.FLOOR).intValue() * integralRule.getGiveConvertAmount();
                            } else { // 不满足赠送积分门槛，不赠积分
                                totalGiveFbNum = 0;
                            }
                        } else { // 不赠送积分
                            totalGiveFbNum = 0;
                        }
                    }
                } else { // 不使用积分抵扣
                    System.out.println("不使用积分抵扣.......");
                    // 不抵扣积分时，总消耗积分为0
                    totalCoustFb = 0;
                    // 总抵扣金额为0
                    totalDeductedAmount = BigDecimal.ZERO;
                    // 订单应付总金额
                    totalActualAmount = payTotalPrices;
                    // 判断是否赠送积分
                    if (integralRule.getIsGiveCredit().equals((byte) 1)) { // 赠送积分
                        // 判断是否达到赠送积分门槛
                        if (integralRule.getGiveMinimum().compareTo(totalActualAmount) <= 0) { // 满足赠送积分门槛
                            // 总赠送积分
                            totalGiveFbNum = totalActualAmount.setScale(0, RoundingMode.FLOOR).intValue() * integralRule.getGiveConvertAmount();
                        } else { // 不满足赠送积分门槛，不赠积分
                            totalGiveFbNum = 0;
                        }
                    } else { // 不赠送积分
                        totalGiveFbNum = 0;
                    }
                }

            } catch (RuntimeException e) {
                e.printStackTrace();
                throw new RuntimeException("该订单不是开门柜订单");
            }
        }

        // 返回结果数据集
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("availableFb", availableFb);          // 当前拥有积分
        returnMap.put("costFb", totalCoustFb);                  // 本次抵扣的积分
        returnMap.put("giveFb", totalGiveFbNum);              // 本次赠送的积分
        returnMap.put("deductedAmount", totalDeductedAmount);    // 本次抵扣的金额
        returnMap.put("actualAmount", totalActualAmount);        // 实际支付
        returnMap.put("fbConfig", JSONObject.toJSONString(integralRule));
        // 积分规则
        // 返回结果
        return returnMap;
    }
}
