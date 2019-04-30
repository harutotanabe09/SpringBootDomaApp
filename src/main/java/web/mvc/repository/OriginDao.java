package web.mvc.repository;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import web.mvc.entity.WebOrigin;

@ConfigAutowireable
@Dao
public interface OriginDao {

  @Select
  List<WebOrigin> selectAll();
}
