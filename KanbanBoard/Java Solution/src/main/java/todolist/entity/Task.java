package todolist.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	private String Title;

	private String Comments;

    public Task() {
    }

    public Task(Integer id, String title, String comments) {
        Title = title;
        Comments = comments;
    }

    @Column(nullable = false)
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Column(nullable = false)
    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
}
