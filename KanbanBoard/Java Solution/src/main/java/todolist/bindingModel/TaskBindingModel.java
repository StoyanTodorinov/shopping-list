package todolist.bindingModel;

public class TaskBindingModel {

    private int Id;

    private String Title;

    private String Comments;

    public TaskBindingModel() {
    }

    public TaskBindingModel(Integer id, String title, String comments) {
        Title = title;
        Comments = comments;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
}
