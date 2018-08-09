package cx.rcd.financial.controller;

import com.alibaba.fastjson.JSON;
import cx.rcd.financial.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/test.json", method = RequestMethod.POST)
    @ResponseBody
    public String refreshSpecialHall() {
        return JSON.toJSONString(userMapper.selectByPrimaryKey(1));
    }

}
