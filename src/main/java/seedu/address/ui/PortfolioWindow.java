package seedu.address.ui;


import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import seedu.address.model.person.Person;
import seedu.address.model.portfolio.Portfolio;

/**
 * An UI component that displays information of a {@code Person}.
 */
public class PortfolioWindow extends UiPart<Region> {

    private static final String FXML = "Portfolio.fxml";
    private static final String RISK_LEVEL = "Risk Level: ";
    private static final String NO_RISK_LEVEL = "no risk assessment yet";
    private static final String NO_NOTE = "no notes yet";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final int id;
    public final Portfolio portfolio;

    @FXML
    private Label risk;
    @FXML
    private VBox plans;
    @FXML
    private ScrollPane scroller;
    @FXML
    private Label note;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public PortfolioWindow(Person person, int displayedIndex) {
        super(FXML);
        scroller.setFitToWidth(true);
        this.portfolio = person.getPortfolio();
        id = displayedIndex;

        if (portfolio.getRisk().value != null && portfolio.getRisk().value != "") {
            risk.setText(RISK_LEVEL + portfolio.getRisk().value);
        } else {
            risk.setText(RISK_LEVEL + NO_RISK_LEVEL);
        }
        portfolio.getPlans().stream()
                .sorted(Comparator.comparing(plan -> plan.value))
                .forEach(plan -> plans.getChildren().add(new Label(plan.value)));

        if (portfolio.getNote().value != null && portfolio.getNote().value != "") {
            note.setText(portfolio.getNote().value);
        } else {
            note.setText(NO_NOTE);
        }
    }

}
