package Builder;

public class test {
    public static void main(String[] args) {
        FormBuilder fBuilder = new FormBuilder ();
        StudentsButtonsBuilder bBuilder = new StudentsButtonsBuilder();
        StudentsWMBuilder wmBuilder= new StudentsWMBuilder ();
        fBuilder.setButtonsBuilder(bBuilder);
        fBuilder.setWMBuilder(wmBuilder);
        fBuilder.constructForm();
        Form form = fBuilder.getForm();
        System.out.println(form.wm.mess);
        for(Button b: form.buttons){
            System.out.println(b.name);
        }
    }
}
