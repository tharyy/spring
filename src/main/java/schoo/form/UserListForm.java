package schoo.form;

import lombok.Data;
/**
 * ユーザ情報のFormクラスです
 */

//@Dateでgetter、setterいらず
@Data
public class UserListForm {
	private String name;
	private Integer age;
}