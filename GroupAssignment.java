import java.time.LocalDate;

public class GroupAssignment extends Assignment {
  private String teamMates;

  public String message() {
    if (this.teamMates != null) {
       return super.message() + " - call " + this.teamMates;
    }

    return super.message();
  }

  public GroupAssignment(LocalDate dueDate, String description, String teamMates) {
    super(dueDate, description);
    this.teamMates = teamMates;
  }

}