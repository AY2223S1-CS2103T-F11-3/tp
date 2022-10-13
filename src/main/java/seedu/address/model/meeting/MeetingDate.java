package seedu.address.model.meeting;

import static seedu.address.commons.util.AppUtil.checkArgument;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * Represents a Meeting in the FinBook.
 * Guarantees: immutable; name is valid as declared in {@link #isValidMeetingDate(String)}
 */
public class MeetingDate {

    public static final String MESSAGE_CONSTRAINTS = "Date should be in the form of dd MMM yyyy";

    public final String meetingDate;

    /**
     * Constructs a {@code Date}. Meeting date can be null
     *
     * @param date A valid date.
     */
    public MeetingDate(String date) {
        if (date != null && !date.isEmpty()) {
            checkArgument(isValidMeetingDate(date), MESSAGE_CONSTRAINTS);
        }
        this.meetingDate = date;

    }

    /**
     * Returns true if a given string is a valid date.
     * Checks if date is valid by parsing string to LocalDate
     */
    public static boolean isValidMeetingDate(String test) {
        if (test != null && !test.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
            try {
                LocalDate.parse(test, formatter);
            } catch (Exception ex) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof MeetingDate // instanceof handles nulls
                && (meetingDate != null && meetingDate.equals(((MeetingDate) other).meetingDate))); // state check
    }

    @Override
    public int hashCode() {
        return meetingDate.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return meetingDate;
    }

}
