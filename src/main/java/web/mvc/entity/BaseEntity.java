package web.mvc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public abstract class BaseEntity implements Serializable {

  /*
   * 作成日時
   */
  @Column(updatable = false)
  public LocalDateTime createdAt;

  /*
   * 作成者
   */
  @Column(updatable = false)
  public String createdBy;

  /*
   * 更新日時
   */
  public LocalDateTime updatedAt;

  /*
   * 更新者
   */
  public String updatedBy;

}
