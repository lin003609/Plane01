package bean;

import java.util.Date;
import java.util.Set;

public class Customer
{
    private String id;//没有业务信息
    private String name;//旅客姓名
    private String customerType;//旅客类型：成人、儿童、婴儿
    private String phone;//旅客电话
    private String carid;//身份证号
    private Date birthDate;
    private Set<Order> orderSet;

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }

    public void setPhone(String phone) { this.phone = phone; }
    public String getPhone() { return phone; }

    public void setCarid(String carid) { this.carid = carid; }
    public String getCarid() { return carid; }

    public Set<Order> getOrderSet() { return orderSet; }
    public void setOrderSet(Set<Order> orderSet) { this.orderSet = orderSet; }
}
