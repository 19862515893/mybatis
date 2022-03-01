import com.syr.dao.TeacherMapper;
import com.syr.pojo.Teacher;
import com.syr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author syr
 * @date 2022/2/18 - 21:42
 */
public class MyTest {
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
