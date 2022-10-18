package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.meeting.MeetingDate;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Income;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.portfolio.Plan;
import seedu.address.model.portfolio.Risk;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_INCOME = "$5230";
    public static final String DEFAULT_MEETINGDATE = "20 Nov 2022";
    public static final String DEFAULT_RISK = "high";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Income income;
    private MeetingDate meetingDate;
    private Set<Tag> tags;
    private Risk risk;
    private Set<Plan> plans;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        income = new Income(DEFAULT_INCOME);
        meetingDate = new MeetingDate(DEFAULT_MEETINGDATE);
        tags = new HashSet<>();
        risk = new Risk(DEFAULT_RISK);
        plans = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        address = personToCopy.getAddress();
        income = personToCopy.getIncome();
        meetingDate = personToCopy.getMeetingDate();
        tags = new HashSet<>(personToCopy.getTags());
        risk = personToCopy.getRisk();
        plans = new HashSet<>(personToCopy.getPlans());
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Income} of the {@code Person} that we are building.
     */
    public PersonBuilder withIncome(String income) {
        this.income = new Income(income);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code MeetingDate} of the {@code Person} that we are building.
     */
    public PersonBuilder withMeetingDate(String meetingDate) {
        this.meetingDate = new MeetingDate(meetingDate);
        return this;
    }

    /**
     * Sets the {@code Risk} of the {@code Person} that we are building.
     */
    public PersonBuilder withRisk(String risk) {
        this.risk = new Risk(risk);
        return this;
    }

    /**
     * Parses the {@code plans} into a {@code Set<Plan>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withPlans(String ... plans) {
        this.plans = SampleDataUtil.getPlanSet(plans);
        return this;
    }

    public Person build() {
        return new Person(name, phone, email, address, income, meetingDate, tags, risk, plans);
    }

}
