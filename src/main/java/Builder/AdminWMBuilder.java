package Builder;

public class AdminWMBuilder extends WelcomeMessageBuilder{
    @Override
    public void printWM(Form form) {
        form.wm = new WelcomeMessage("Hello admin");
    }
}
