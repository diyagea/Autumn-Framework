package com.autumnframework.cms.dao.vomapper.interfaces;

import com.autumnframework.cms.model.vo.SysMenu;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:28 2017/9/4.
 */
public interface ISysMapper {
    List<SysMenu> getMenuBySys(String sys) throws SQLException;
}
