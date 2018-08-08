package cx.rcd.financial.model;

import java.util.Date;

public class Attribute {

    private Integer id;

    private Integer rcdId;

    private Integer categoryId;

    private Date created;

    private Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRcdId() {
        return rcdId;
    }

    public void setRcdId(Integer rcdId) {
        this.rcdId = rcdId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}