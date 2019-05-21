package org.zendesk.client.v2.search;

import static org.zendesk.client.v2.search.Operator.AS_IS;
import static org.zendesk.client.v2.search.Operator.EQ;

public class TicketSearchableProperty extends SearchableProperty {

    public static final SearchableProperty ID = new TicketSearchableProperty("", AS_IS);
    public static final SearchableProperty TYPE = new TicketSearchableProperty("type", EQ);
    public static final SearchableProperty TAGS = new TicketSearchableProperty("tags", EQ);
    public static final SearchableProperty REQUESTER = new TicketSearchableProperty("requester", EQ);
    public static final SearchableProperty STATUS = new TicketSearchableProperty("status", EQ);

    private TicketSearchableProperty(String property, Operator... supportedOperators) {
        super(property, supportedOperators);
    }
}
