package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussPostMapper {

    /**
     * 查询所有帖子
     * @param userId 根据用户id查，不传int默认是0，则是查询所有帖子
     * @param offset 分页的起始页
     * @param limit 每页多少条
     * @return 返回查询的帖子
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 帖子总记录数
     * @param userId @Param注解用于给int userId参数取别名
     *               若方法仅一个参数,且在动态SQL里使用<if>进行判断拼接,则必须加别名.
     * @return 帖子总记录数
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
