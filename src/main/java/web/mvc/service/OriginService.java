package web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.mvc.entity.WebOrigin;
import web.mvc.repository.OriginDao;

@Service
@Transactional
public class OriginService {

	@Autowired
	private OriginDao originDao;

	/**
	 * DBから全件データ取得
	 * @return List<WebOrigin>  取得データ
	 */
	public List<WebOrigin> findAll() {
		return originDao.selectAll();
	}

}
