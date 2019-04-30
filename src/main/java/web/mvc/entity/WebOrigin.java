package web.mvc.entity;

import org.seasar.doma.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WebOrigin extends BaseEntity {

  String clientId;

  String value;

}
