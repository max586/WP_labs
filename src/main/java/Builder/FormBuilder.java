package Builder;

public class FormBuilder {
    private ButtonsBuilder buttonsBuilder=null;
    private Form form;
    private WelcomeMessageBuilder welcomeMessageBuilder=null; 
    public void constructForm(){
        form = new Form();
        if(buttonsBuilder!=null && welcomeMessageBuilder!=null) {
            buttonsBuilder.addButtons(form);
            welcomeMessageBuilder.printWM(form);
        }
    }
    
    public void setButtonsBuilder(ButtonsBuilder buttonsBuilder){
        this.buttonsBuilder = buttonsBuilder;
    }

    public void setWMBuilder(WelcomeMessageBuilder welcomeMessageBuilder) {
        this.welcomeMessageBuilder = welcomeMessageBuilder;
    }

    public Form getForm() {
        return form;
    }
}
