package jenkins.plugins.rocket.model;

public class Message {

  private String msg;

  public Message(String messsage) {
    this.msg = messsage;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
