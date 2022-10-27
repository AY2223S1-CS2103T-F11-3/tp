package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.meeting.MeetingDate;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Income;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.portfolio.Note;
import seedu.address.model.portfolio.Plan;
import seedu.address.model.portfolio.Risk;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"), new Income("$1000"), new MeetingDate("12 Nov 2022"),
                getTagSet("friends"), new Risk("low"), getPlanSet("Prudential retirement plan"),
                getNoteSet("is currently having COVID")),
            new Person(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), new Income("$5300"),
                new MeetingDate("20 Nov 2022"), getTagSet("colleagues", "friends"),
                new Risk("high"), getPlanSet("NTUC Income plan"), getNoteSet("")),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), new Income("$3080"), new MeetingDate("08 Nov 2022"),
                getTagSet("neighbours"), new Risk("low"), getPlanSet("Prudential retirement plan"),
                getNoteSet("is currently retired")),
            new Person(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), new Income("$440"),
                new MeetingDate("13 Dec 2022"), getTagSet("family"),
                new Risk("high"), getPlanSet("Singapore Medishield"),
                getNoteSet("is currently working")),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"), new Income("$12000"), new MeetingDate("15 Nov 2022"),
                getTagSet("classmates"), new Risk("medium"), getPlanSet("DBS investment plan"),
                getNoteSet("is having terminal illness")),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"), new Income("$800"), new MeetingDate("03 Oct 2022"),
                getTagSet("colleagues"), new Risk("low"), getPlanSet("Singapore Savings Bond"),
                getNoteSet("is on a holiday"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
            .map(Tag::new)
            .collect(Collectors.toSet());
    }

    /**
     * Returns a plan set containing the list of strings given.
     */
    public static Set<Plan> getPlanSet(String... strings) {
        return Arrays.stream(strings)
            .map(Plan::new)
            .collect(Collectors.toSet());
    }

    /**
     * Returns a note set containing the list of strings given.
     */
    public static Set<Note> getNoteSet(String... strings) {
        return Arrays.stream(strings)
            .map(Note::new)
            .collect(Collectors.toSet());
    }


}
