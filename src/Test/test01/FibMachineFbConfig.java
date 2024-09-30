package Test.test01;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付接口配置参数表
 * fib_machine_fb_config
 */
public class FibMachineFbConfig implements Serializable {

    public FibMachineFbConfig() {
    }

    public FibMachineFbConfig(Long id, String name, String appId, Byte isGiveCredit, BigDecimal giveMinimum, Integer giveConvertAmount, Byte isSpendCredit, BigDecimal spendMinimum, BigDecimal spendConvertMoney, String deleted, Date createTime, Date updateTime, String createBy, String updateBy, BigDecimal maxRate, Integer operatorId, String operatorName) {
        this.id = id;
        this.name = name;
        this.appId = appId;
        this.isGiveCredit = isGiveCredit;
        this.giveMinimum = giveMinimum;
        this.giveConvertAmount = giveConvertAmount;
        this.isSpendCredit = isSpendCredit;
        this.spendMinimum = spendMinimum;
        this.spendConvertMoney = spendConvertMoney;
        this.deleted = deleted;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.maxRate = maxRate;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }

    /**
     * ID
     */
    private Long id;

    /**
     * 规则名
     */
    private String name;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 是否赠送积分: 1-是, 0-否
     */
    private Byte isGiveCredit;

    /**
     * 起赠消费金额
     */
    private BigDecimal giveMinimum;

    /**
     * 每消费一元赠送积分数量
     */
    private Integer giveConvertAmount;

    /**
     * 是否可使用积分抵现: 1-是, 0-否
     */
    private Byte isSpendCredit;

    /**
     * 使用门槛
     */
    private BigDecimal spendMinimum;

    /**
     * 每一积分可抵现多少元
     */
    private BigDecimal spendConvertMoney;

    private String deleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建者姓名
     */
    private String createBy;

    /**
     * 更新者姓名
     */
    private String updateBy;

    /**
     * 最大抵扣比例,大于等于0且小于1,否则不生效
     */
    private BigDecimal maxRate;

    /**
     * 运营商id
     */
    private Integer operatorId;

    /**
     * 运营商名称
     */
    private String operatorName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Byte getIsGiveCredit() {
        return isGiveCredit;
    }

    public void setIsGiveCredit(Byte isGiveCredit) {
        this.isGiveCredit = isGiveCredit;
    }

    public BigDecimal getGiveMinimum() {
        return giveMinimum;
    }

    public void setGiveMinimum(BigDecimal giveMinimum) {
        this.giveMinimum = giveMinimum;
    }

    public Integer getGiveConvertAmount() {
        return giveConvertAmount;
    }

    public void setGiveConvertAmount(Integer giveConvertAmount) {
        this.giveConvertAmount = giveConvertAmount;
    }

    public Byte getIsSpendCredit() {
        return isSpendCredit;
    }

    public void setIsSpendCredit(Byte isSpendCredit) {
        this.isSpendCredit = isSpendCredit;
    }

    public BigDecimal getSpendMinimum() {
        return spendMinimum;
    }

    public void setSpendMinimum(BigDecimal spendMinimum) {
        this.spendMinimum = spendMinimum;
    }

    public BigDecimal getSpendConvertMoney() {
        return spendConvertMoney;
    }

    public void setSpendConvertMoney(BigDecimal spendConvertMoney) {
        this.spendConvertMoney = spendConvertMoney;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public BigDecimal getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(BigDecimal maxRate) {
        this.maxRate = maxRate;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}