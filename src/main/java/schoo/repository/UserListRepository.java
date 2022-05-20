package schoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoo.entity.UserList;

/**
 * user_listテーブルを操作するためのRepositoryクラスです
 */
public interface UserListRepository extends JpaRepository<UserList, Integer> {
//
//	public List<UserList> findAllByOrderByIdDesc();
//
//	@Query("select u from UserList u where u.id =1")
//	public UserList findByUserOne();
}