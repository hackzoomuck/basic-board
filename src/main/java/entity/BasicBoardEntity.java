package entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "basicBoard")
@Getter
@Setter
public class BasicBoardEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "title_id", length = 11, nullable = false)
  private int titleId;

  @Column(name = "user_id", length = 11, nullable = false)
  private int userId;

  @Column(name = "user_password", length = 11, nullable = false)
  private int userPassword;

  @Column(name = "title", length = 20, nullable = false)
  private String title;

  @Column(name = "contents", length = 100, nullable = false)
  private String contents;
}
