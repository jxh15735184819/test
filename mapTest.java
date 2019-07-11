import java.util.HashMap;
import java.util.Map;

public class mapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("产品研发部", "【CP】");
        map.put("商务发展部", "【SW】");
        map.put("新兴支付网络部", "【ZF】");
        map.put("科技管理部", "【KJ】");
        map.put("成都科技板块", "【D01】");
        map.put("技术保障室", "【JB】");
        map.put("系统安全室", "【XA】");
        map.put("风控核心板块", "【Y01】");
        map.put("支付结算板块", "【Y02】");
        map.put("客户联络板块", "【Y03】");
        map.put("场景金融板块", "【Y04】");
        map.put("智能创新板块", "【Y05】");
        map.put("测试管理版块", "【Y06】");
        map.put("营销权益板块", "【Y07】");
        map.put("移动互联板块", "【Y08】");
        map.put("平台技术板块", "【Y09】");
        map.put("获客运营板块", "【Y10】");
        map.put("综合业务板块", "【Y11】");
        map.put("运行维护室", "【YW】");
        map.put("质量管控室", "【ZG】");
        map.put("办公室", "【BG】");
        map.put("保卫处", "【BW】");
        map.put("电商理财部", "【DS】");
        map.put("法律合规部", "【FL】");
        map.put("高端联盟合作部", "【GD】");
        map.put("计划财务部", "【JC】");
        map.put("纪检监察室", "【JL】");
        map.put("金融同业部", "【JR】");
        map.put("集团客户部", "【JT】");
        map.put("客户服务部", "【KF】");
        map.put("企业文化部", "【QW】");
        map.put("人力资源部", "【RL】");
        map.put("市场推广部", "【SC】");
        map.put("大数据分析与应用部", "【SJ】");
        map.put("授信评审部", "【SX】");
        map.put("运营管理部", "【YY】");
        map.put("资产保全部", "【ZB】");
        map.put("战略发展部", "【ZL】");
        map.put("资产管理部", "【ZC】");
        //String s = map.get("资产管理部");
        System.out.println(map.size());;
        String s = map.toString();
        System.out.println(s);
    }
}
