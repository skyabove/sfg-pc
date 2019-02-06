package sky.one.data.model.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
