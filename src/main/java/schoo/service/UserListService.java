package schoo.service;

import java.util.List;

import schoo.entity.UserList;

/**
 * user_list関連のServiceを提供するクラスです
 */

public interface UserListService {

	public List<UserList> findAll();
	/**
	 * user_listテーブルへの登録処理です
	 * @param name
	 * @param age
	 * @return	user_listに登録する名前と年齢
	 */
	public void save(String name, Integer age) ;
	/**
	 * user_listテーブルから指定されたIDのユーザ情報を削除します
	 * @param id
	 * @return	user_listに登録する名前と年齢
	 */
	public void delete(Integer id) ;
}