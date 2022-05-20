package schoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import schoo.entity.Event;
import schoo.service.EventService;

@Controller
public class EventController {

	@Autowired
	EventService eventService;


	/**
	 * トップページ（イベント一覧画面）を表示します.
	 * @param model
	 * @return イベント一覧画面のパス
	 */
	@GetMapping("eventlist")
	public String index(Model model) {
		// DBに登録されているイベントの一覧を取得
		List<Event> eventList = eventService.findAll();

		// modelにイベントの一覧をセット
		model.addAttribute("eventList", eventList);

		// 次に表示する画面のパス（htmlファイルの名称）を返却
		return "eventlist";
	}
	/**
	 * トップページ（イベント一覧画面）を表示します.
	 * @param model
	 * @return イベント登録画面
	 */
	@GetMapping("regist")
	public String regist(Model model) {
		return "regist";
	}

}
