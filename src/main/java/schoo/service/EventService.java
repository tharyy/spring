package schoo.service;

import java.util.List;

import schoo.entity.Event;
import schoo.form.EventForm;

/*
 * 処理を呼び出す
 */
public interface EventService {

	public List<Event> findAll();

	public List<Event> findByEventId(Integer eventId);

	public void save(EventForm eventForm) ;
}
