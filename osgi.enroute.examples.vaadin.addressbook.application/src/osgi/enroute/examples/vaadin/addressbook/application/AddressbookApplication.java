package osgi.enroute.examples.vaadin.addressbook.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.vaadin.server.UICreateEvent;

import osgi.enroute.examples.vaadin.api.Application;


@Component(name = "osgi.enroute.examples.vaadin.addressbook", property = "alias=/addr")
public class AddressbookApplication implements Application<AddressbookUI> {


	@Reference
	ContactService contacts;
	
	@Override
	public Class<AddressbookUI> getUIClass() {
		return AddressbookUI.class;
	}

	@Override
	public AddressbookUI getInstance(UICreateEvent event) {
		return new AddressbookUI(contacts);
	}

}
