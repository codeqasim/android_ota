package ModelClass;

/**
 * Created by wolfsoft5 on 25/6/18.
 */

public class SelectRoomModelClass {

    Integer image;
    String title;
    String confirmation;
    Integer pay_img;
    String payment;

    public SelectRoomModelClass(Integer image, String title, String confirmation, Integer pay_img, String payment) {
        this.image = image;
        this.title = title;
        this.confirmation = confirmation;
        this.pay_img = pay_img;
        this.payment = payment;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public Integer getPay_img() {
        return pay_img;
    }

    public void setPay_img(Integer pay_img) {
        this.pay_img = pay_img;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
