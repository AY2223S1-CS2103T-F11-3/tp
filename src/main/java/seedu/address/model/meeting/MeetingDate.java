package seedu.address.model.meeting;

import static seedu.address.commons.util.AppUtil.checkArgument;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * Represents a Meeting in the FinBook.
 * Guarantees: immutable; name is valid as declared in {@link #isValidMeetingDate(String)}
 */
public class MeetingDate {

    public static final String MESSAGE_CONSTRAINTS = "Date should be in the form of dd MMM yyyy [HH:mm]\n"
            + "Example: 12 Nov 2022 or 12 Nov 2022 16:30";

    public final String value;

    /**
     * Constructs a {@code DateTime}. Meeting date and time can be null
     *
     * @param dateTime A valid date or dateTime.
     */
    public MeetingDate(String dateTime) {
        if (dateTime != null && !dateTime.isEmpty()) {
            checkArgument(isValidMeetingDate(dateTime), MESSAGE_CONSTRAINTS);
        }
        this.value = dateTime;

    }

    /**
     * Returns true if a given string is a valid date or dateTime.
     * Checks if date or dateTime is valid by parsing string to LocalDate or LocalDateTime
     */
    public static boolean isValidMeetingDate(String test) {
        if (test != null && !test.isEmpty()) {
            DateTimeFormatter formatter;
            try {
                if (test.contains(":")) {
                    formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm", Locale.ENGLISH);
                    LocalDateTime.parse(test, formatter);
                } else {
                    formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
                    LocalDate.parse(test, formatter);
                }
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
                && (value != null && value.equals(((MeetingDate) other).value))); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return value;
    }

}
