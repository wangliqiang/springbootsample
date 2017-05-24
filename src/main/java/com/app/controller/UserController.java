package com.app.controller;

import com.app.common.BaseController;
import com.app.common.PageData;
import com.app.service.UserService;
import com.sun.istack.internal.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王立强 on 2017/5/19.
 */
@RestController
@EnableAutoConfiguration
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listall", method = RequestMethod.GET)
    public Map listAll() {
        Map<Object, Object> map = new HashMap<>();
        map.put("status", "success");
        map.put("code", "1");
        map.put("msg", "");
        map.put("data", userService.listAll());
        return map;
    }

    @RequestMapping(value = "/findone", method = RequestMethod.POST)
    public PageData findOne() {
        PageData pd = this.getPageData();
        return userService.findOne(pd.getString("id"));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getString() {
        PageData pd = this.getPageData();
        String code = pd.getString("code");
        if (code.equals("88888888")) {
            return "{\n" +
                    "    \"msg\":\"\",\n" +
                    "    \"status\":\"0\",\n" +
                    "    \"data\":{\n" +
                    "        \"info\":{\n" +
                    "            \"status\":\"1\",\n" +
                    "            \"com\":\"ems\",\n" +
                    "            \"state\":\"3\",\n" +
                    "            \"context\":[\n" +
                    "                {\n" +
                    "                    \"time\":\"1450252800\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 已签收,他人收[龙锦苑投递组]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1450172897\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 预约2015.12.16再投[龙锦苑投递组]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1450153979\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 [龙锦苑投递组10220812]正在投递\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1450088166\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 预约2015.12.15再投[龙锦苑投递组]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1450062684\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 [龙锦苑投递组10220812]正在投递\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1450000825\",\n" +
                    "                    \"desc\":\"【龙锦苑投递组】 到达[龙锦苑投递组10220812]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449887960\",\n" +
                    "                    \"desc\":\"【天通西苑投递组】 转他局处理,原因:非本站试他局[天通西苑投递组]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449886219\",\n" +
                    "                    \"desc\":\"【天通西苑投递组】 [天通西苑投递组10221806]正在投递\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449871677\",\n" +
                    "                    \"desc\":\"【天通西苑投递组】 到达[天通西苑投递组10221806]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449866125\",\n" +
                    "                    \"desc\":\"【北京】 离开[北京10000000]，下一站是[京天通西],总包[5602],邮路[沙河-J1]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449838500\",\n" +
                    "                    \"desc\":\"【北京市】 [北京市10000000]已经封发,总包[5602]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449827400\",\n" +
                    "                    \"desc\":\"【亚运村邮局大宗二组】 离开[亚运村邮局大宗二组10010120]，下一站是[北京市],总包[5434],邮路[商函-小包出口]\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"time\":\"1449820658\",\n" +
                    "                    \"desc\":\"【亚运村邮局大宗二组】 [北京市亚运村邮局大宗二组10010120]已经收寄\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"_source_com\":\"\"\n" +
                    "        },\n" +
                    "        \"com\":\"ems\",\n" +
                    "        \"company\":{\n" +
                    "            \"url\":\"http://www.kuaidi100.com/all/ems.shtml?from=openv\",\n" +
                    "            \"fullname\":\"EMS\",\n" +
                    "            \"shortname\":\"EMS\",\n" +
                    "            \"icon\":{\n" +
                    "                \"id\":\"2\",\n" +
                    "                \"smallurl\":\"https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1807529516,3291075151&fm=58\",\n" +
                    "                \"smallpos\":\"0,944\",\n" +
                    "                \"middleurl\":\"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1835223070,3312272045&fm=58\",\n" +
                    "                \"middlepos\":\"0,828\",\n" +
                    "                \"normal\":\"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=295567570,1377797753&fm=58\"\n" +
                    "            },\n" +
                    "            \"website\":{\n" +
                    "                \"title\":\"www.ems.com.cn\",\n" +
                    "                \"url\":\"http://www.ems.com.cn/\"\n" +
                    "            },\n" +
                    "            \"tel\":\"11183\",\n" +
                    "            \"auxiliary\":[\n" +
                    "                {\n" +
                    "                    \"title\":\"网点查询\",\n" +
                    "                    \"url\":\"http://www.ems.com.cn/serviceguide/tong_da_fan_wei.html\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"title\":\"网上寄件\",\n" +
                    "                    \"url\":\"http://www.ems.com.cn/serviceguide/zifeichaxun/zi_fei_biao_zhun.html\"\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        \"source\":{\n" +
                    "            \"logo\":\"https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1429564979,1787167512&fm=58\",\n" +
                    "            \"title\":\"数据来自快递100\",\n" +
                    "            \"url\":\"http://www.kuaidi100.com/\",\n" +
                    "            \"name\":\"快递100\"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
        } else if ("".equals(code)) {
            return "{\"msg\":\" 单号不能为空\",\"status\":\"-1\"}";
        } else {
            return "{\"msg\":\" 该单号暂无物流进展，请稍后再试，或检查公司和单号是否有误\",\"status\":\"-2\"}";
        }
    }
}
