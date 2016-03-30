package domain.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/29.
 */
@Entity(name = "tb_news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "newsid")
    private  int newsid;
    @Column(nullable = false,length = 50)
    public  String title;
    @Column(nullable = false)
    @Type(type = "text")
    public  String content;
    @Temporal(TemporalType.DATE)
    @Column(name = "createtime",nullable = false)
    private Date createtime;
    @Column(name = "sortorder",nullable = false)
    private  int sortorder;
    @Column(name = "ishome",nullable = false)
    private  int ishome;

    public NewsClass getNewsClass() {
        return newsClass;
    }

    public void setNewsClass(NewsClass newsClass) {
        this.newsClass = newsClass;
    }
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "classid",referencedColumnName = "classid")
    private NewsClass newsClass;
    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSortorder() {
        return sortorder;
    }

    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }

    public int getIshome() {
        return ishome;
    }

    public void setIshome(int ishome) {
        this.ishome = ishome;
    }


}
