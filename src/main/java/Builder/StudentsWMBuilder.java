package Builder;

public class StudentsWMBuilder extends WelcomeMessageBuilder{
    @Override
    public void printWM(Form form) {
        form.wm = new WelcomeMessage("Hello student");
    }
}
