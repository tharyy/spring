package schoo.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoo.entity.Event;
import schoo.form.EventForm;
import schoo.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;

	/**
	 * DBに登録されている全てのイベント情報を検索します.
	 * @return イベント一覧
	 */
	public List<Event> findAll() {
		// Repositoryクラスから全ての情報を検索して返却
		return eventRepository.findAll();
	}

	/**
	 * 指定されたイベントIDからDBに登録されているイベント情報を検索します.
	 * @return イベント一覧
	 */
	public List<Event> findByEventId(Integer eventId) {
		// RepositoryクラスからイベントIDで検索した結果を返却
		return eventRepository.findByEventId(eventId);
	}

	/**
	 * イベント情報をDBに登録します.
	 */
	public void save(EventForm eventForm) {
		// EventForm内の情報をEventクラスに詰め替え
		Event event = new Event();
		event.setEventName(eventForm.getEventName());
		event.setEventDate(Date.valueOf(eventForm.getEventData()));
		event.setEventVenue(eventForm.getEventVenue());

		// Eventクラスの情報を使ってDBに登録する処理を実行
		eventRepository.save(event);
	}
}
