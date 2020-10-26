package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiscussPost {

    /**
     * userId：用户id
     * title：帖子标题
     * content：帖子内容
     * type：帖子类型，0普通; 1置顶
     * status: 帖子状态，0正常; 1精华; 2拉黑
     * createTime: 帖子创建时间
     * commentCount: 帖子下的评论
     * score: 帖子评分，用以排序，排名
     */
    private int id;
    private int userId;
    private String title;
    private String content;//text
    private int type;
    private int status;
    private Date createTime;//timestamp
    private int commentCount;
    private double score;//double


}
