import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	JamesBond jBObj;
	@Before
	public void setUp() throws Exception {
		jBObj = new JamesBond();
	}

@Test
	public void testCase0(){

	assertFalse(jBObj.bondRegex("("));

	}

	@Test
	public void testCase1(){

	assertFalse(jBObj.bondRegex("(("));

	}

	@Test
	public void testCase2(){

	assertFalse(jBObj.bondRegex("((("));

	}

	@Test
	public void testCase3(){

	assertFalse(jBObj.bondRegex("(()"));

	}

	@Test
	public void testCase4(){

	assertTrue(jBObj.bondRegex("((007)"));

	}

	@Test
	public void testCase5(){

	assertFalse(jBObj.bondRegex("((07)"));

	}

	@Test
	public void testCase6(){

	assertFalse(jBObj.bondRegex("((7)"));

	}

	@Test
	public void testCase7(){

	assertFalse(jBObj.bondRegex("()"));

	}

	@Test
	public void testCase8(){

	assertFalse(jBObj.bondRegex("()("));

	}

	@Test
	public void testCase9(){

	assertFalse(jBObj.bondRegex("())"));

	}

	@Test
	public void testCase10(){

	assertTrue(jBObj.bondRegex("()007)"));

	}

	@Test
	public void testCase11(){

	assertFalse(jBObj.bondRegex("()07)"));

	}

	@Test
	public void testCase12(){

	assertFalse(jBObj.bondRegex("()7)"));

	}

	@Test
	public void testCase13(){

	assertFalse(jBObj.bondRegex("(0("));

	}

	@Test
	public void testCase14(){

	assertFalse(jBObj.bondRegex("(0(("));

	}

	@Test
	public void testCase15(){

	assertFalse(jBObj.bondRegex("(0()"));

	}

	@Test
	public void testCase16(){

	assertTrue(jBObj.bondRegex("(0(007)"));

	}

	@Test
	public void testCase17(){

	assertFalse(jBObj.bondRegex("(0(07)"));

	}

	@Test
	public void testCase18(){

	assertFalse(jBObj.bondRegex("(0(7)"));

	}

	@Test
	public void testCase19(){

	assertFalse(jBObj.bondRegex("(0)"));

	}

	@Test
	public void testCase20(){

	assertFalse(jBObj.bondRegex("(0)("));

	}

	@Test
	public void testCase21(){

	assertFalse(jBObj.bondRegex("(0))"));

	}

	@Test
	public void testCase22(){

	assertTrue(jBObj.bondRegex("(0)007)"));

	}

	@Test
	public void testCase23(){

	assertFalse(jBObj.bondRegex("(0)07)"));

	}

	@Test
	public void testCase24(){

	assertFalse(jBObj.bondRegex("(0)7)"));

	}

	@Test
	public void testCase25(){

	assertFalse(jBObj.bondRegex("(00("));

	}

	@Test
	public void testCase26(){

	assertFalse(jBObj.bondRegex("(00(("));

	}

	@Test
	public void testCase27(){

	assertFalse(jBObj.bondRegex("(00()"));

	}

	@Test
	public void testCase28(){

	assertTrue(jBObj.bondRegex("(00(007)"));

	}

	@Test
	public void testCase29(){

	assertFalse(jBObj.bondRegex("(00(07)"));

	}

	@Test
	public void testCase30(){

	assertFalse(jBObj.bondRegex("(00(7)"));

	}

	@Test
	public void testCase31(){

	assertFalse(jBObj.bondRegex("(00)"));

	}

	@Test
	public void testCase32(){

	assertFalse(jBObj.bondRegex("(00)("));

	}

	@Test
	public void testCase33(){

	assertFalse(jBObj.bondRegex("(00))"));

	}

	@Test
	public void testCase34(){

	assertTrue(jBObj.bondRegex("(00)007)"));

	}

	@Test
	public void testCase35(){

	assertFalse(jBObj.bondRegex("(00)07)"));

	}

	@Test
	public void testCase36(){

	assertFalse(jBObj.bondRegex("(00)7)"));

	}

	@Test
	public void testCase37(){

	assertFalse(jBObj.bondRegex("(000("));

	}

	@Test
	public void testCase38(){

	assertFalse(jBObj.bondRegex("(000)"));

	}

	@Test
	public void testCase39(){

	assertTrue(jBObj.bondRegex("(000007)"));

	}

	@Test
	public void testCase40(){

	assertTrue(jBObj.bondRegex("(00007)"));

	}

	@Test
	public void testCase41(){

	assertTrue(jBObj.bondRegex("(0007)"));

	}

	@Test
	public void testCase42(){

	assertFalse(jBObj.bondRegex("(001("));

	}

	@Test
	public void testCase43(){

	assertFalse(jBObj.bondRegex("(001)"));

	}

	@Test
	public void testCase44(){

	assertTrue(jBObj.bondRegex("(001007)"));

	}

	@Test
	public void testCase45(){

	assertFalse(jBObj.bondRegex("(00107)"));

	}

	@Test
	public void testCase46(){

	assertFalse(jBObj.bondRegex("(0017)"));

	}

	@Test
	public void testCase47(){

	assertFalse(jBObj.bondRegex("(002("));

	}

	@Test
	public void testCase48(){

	assertFalse(jBObj.bondRegex("(002)"));

	}

	@Test
	public void testCase49(){

	assertTrue(jBObj.bondRegex("(002007)"));

	}

	@Test
	public void testCase50(){

	assertFalse(jBObj.bondRegex("(00207)"));

	}

	@Test
	public void testCase51(){

	assertFalse(jBObj.bondRegex("(0027)"));

	}

	@Test
	public void testCase52(){

	assertFalse(jBObj.bondRegex("(003("));

	}

	@Test
	public void testCase53(){

	assertFalse(jBObj.bondRegex("(003)"));

	}

	@Test
	public void testCase54(){

	assertTrue(jBObj.bondRegex("(003007)"));

	}

	@Test
	public void testCase55(){

	assertFalse(jBObj.bondRegex("(00307)"));

	}

	@Test
	public void testCase56(){

	assertFalse(jBObj.bondRegex("(0037)"));

	}

	@Test
	public void testCase57(){

	assertFalse(jBObj.bondRegex("(004("));

	}

	@Test
	public void testCase58(){

	assertFalse(jBObj.bondRegex("(004)"));

	}

	@Test
	public void testCase59(){

	assertTrue(jBObj.bondRegex("(004007)"));

	}

	@Test
	public void testCase60(){

	assertFalse(jBObj.bondRegex("(00407)"));

	}

	@Test
	public void testCase61(){

	assertFalse(jBObj.bondRegex("(0047)"));

	}

	@Test
	public void testCase62(){

	assertFalse(jBObj.bondRegex("(005("));

	}

	@Test
	public void testCase63(){

	assertFalse(jBObj.bondRegex("(005)"));

	}

	@Test
	public void testCase64(){

	assertTrue(jBObj.bondRegex("(005007)"));

	}

	@Test
	public void testCase65(){

	assertFalse(jBObj.bondRegex("(00507)"));

	}

	@Test
	public void testCase66(){

	assertFalse(jBObj.bondRegex("(0057)"));

	}

	@Test
	public void testCase67(){

	assertFalse(jBObj.bondRegex("(006("));

	}

	@Test
	public void testCase68(){

	assertFalse(jBObj.bondRegex("(006)"));

	}

	@Test
	public void testCase69(){

	assertTrue(jBObj.bondRegex("(006007)"));

	}

	@Test
	public void testCase70(){

	assertFalse(jBObj.bondRegex("(00607)"));

	}

	@Test
	public void testCase71(){

	assertFalse(jBObj.bondRegex("(0067)"));

	}

	@Test
	public void testCase72(){

	assertFalse(jBObj.bondRegex("(007("));

	}

	@Test
	public void testCase73(){

	assertFalse(jBObj.bondRegex("(007(("));

	}

	@Test
	public void testCase74(){

	assertTrue(jBObj.bondRegex("(007()"));

	}

	@Test
	public void testCase75(){

	assertTrue(jBObj.bondRegex("(007(007)"));

	}

	@Test
	public void testCase76(){

	assertTrue(jBObj.bondRegex("(007(07)"));

	}

	@Test
	public void testCase77(){

	assertTrue(jBObj.bondRegex("(007(7)"));

	}

	@Test
	public void testCase78(){

	assertTrue(jBObj.bondRegex("(007)"));

	}

	@Test
	public void testCase79(){

	assertTrue(jBObj.bondRegex("(007)("));

	}

	@Test
	public void testCase80(){

	assertTrue(jBObj.bondRegex("(007)(("));

	}

	@Test
	public void testCase81(){

	assertTrue(jBObj.bondRegex("(007)()"));

	}

	@Test
	public void testCase82(){

	assertTrue(jBObj.bondRegex("(007)(007)"));

	}

	@Test
	public void testCase83(){

	assertTrue(jBObj.bondRegex("(007)(07)"));

	}

	@Test
	public void testCase84(){

	assertTrue(jBObj.bondRegex("(007)(7)"));

	}

	@Test
	public void testCase85(){

	assertTrue(jBObj.bondRegex("(007))"));

	}

	@Test
	public void testCase86(){

	assertTrue(jBObj.bondRegex("(007))("));

	}

	@Test
	public void testCase87(){

	assertTrue(jBObj.bondRegex("(007)))"));

	}

	@Test
	public void testCase88(){

	assertTrue(jBObj.bondRegex("(007))007)"));

	}

	@Test
	public void testCase89(){

	assertTrue(jBObj.bondRegex("(007))07)"));

	}

	@Test
	public void testCase90(){

	assertTrue(jBObj.bondRegex("(007))7)"));

	}

	@Test
	public void testCase91(){

	assertTrue(jBObj.bondRegex("(007)0("));

	}

	@Test
	public void testCase92(){

	assertTrue(jBObj.bondRegex("(007)0)"));

	}

	@Test
	public void testCase93(){

	assertTrue(jBObj.bondRegex("(007)0007)"));

	}

	@Test
	public void testCase94(){

	assertTrue(jBObj.bondRegex("(007)007)"));

	}

	@Test
	public void testCase95(){

	assertTrue(jBObj.bondRegex("(007)07)"));

	}

	@Test
	public void testCase96(){

	assertTrue(jBObj.bondRegex("(007)1("));

	}

	@Test
	public void testCase97(){

	assertTrue(jBObj.bondRegex("(007)1)"));

	}

	@Test
	public void testCase98(){

	assertTrue(jBObj.bondRegex("(007)1007)"));

	}

	@Test
	public void testCase99(){

	assertTrue(jBObj.bondRegex("(007)107)"));

	}

	@Test
	public void testCase100(){

	assertTrue(jBObj.bondRegex("(007)17)"));

	}

	@Test
	public void testCase101(){

	assertTrue(jBObj.bondRegex("(007)2("));

	}

	@Test
	public void testCase102(){

	assertTrue(jBObj.bondRegex("(007)2)"));

	}

	@Test
	public void testCase103(){

	assertTrue(jBObj.bondRegex("(007)2007)"));

	}

	@Test
	public void testCase104(){

	assertTrue(jBObj.bondRegex("(007)207)"));

	}

	@Test
	public void testCase105(){

	assertTrue(jBObj.bondRegex("(007)27)"));

	}

	@Test
	public void testCase106(){

	assertTrue(jBObj.bondRegex("(007)3("));

	}

	@Test
	public void testCase107(){

	assertTrue(jBObj.bondRegex("(007)3)"));

	}

	@Test
	public void testCase108(){

	assertTrue(jBObj.bondRegex("(007)3007)"));

	}

	@Test
	public void testCase109(){

	assertTrue(jBObj.bondRegex("(007)307)"));

	}

	@Test
	public void testCase110(){

	assertTrue(jBObj.bondRegex("(007)37)"));

	}

	@Test
	public void testCase111(){

	assertTrue(jBObj.bondRegex("(007)4("));

	}

	@Test
	public void testCase112(){

	assertTrue(jBObj.bondRegex("(007)4)"));

	}

	@Test
	public void testCase113(){

	assertTrue(jBObj.bondRegex("(007)4007)"));

	}

	@Test
	public void testCase114(){

	assertTrue(jBObj.bondRegex("(007)407)"));

	}

	@Test
	public void testCase115(){

	assertTrue(jBObj.bondRegex("(007)47)"));

	}

	@Test
	public void testCase116(){

	assertTrue(jBObj.bondRegex("(007)5("));

	}

	@Test
	public void testCase117(){

	assertTrue(jBObj.bondRegex("(007)5)"));

	}

	@Test
	public void testCase118(){

	assertTrue(jBObj.bondRegex("(007)5007)"));

	}

	@Test
	public void testCase119(){

	assertTrue(jBObj.bondRegex("(007)507)"));

	}

	@Test
	public void testCase120(){

	assertTrue(jBObj.bondRegex("(007)57)"));

	}

	@Test
	public void testCase121(){

	assertTrue(jBObj.bondRegex("(007)6("));

	}

	@Test
	public void testCase122(){

	assertTrue(jBObj.bondRegex("(007)6)"));

	}

	@Test
	public void testCase123(){

	assertTrue(jBObj.bondRegex("(007)6007)"));

	}

	@Test
	public void testCase124(){

	assertTrue(jBObj.bondRegex("(007)607)"));

	}

	@Test
	public void testCase125(){

	assertTrue(jBObj.bondRegex("(007)67)"));

	}

	@Test
	public void testCase126(){

	assertTrue(jBObj.bondRegex("(007)7("));

	}

	@Test
	public void testCase127(){

	assertTrue(jBObj.bondRegex("(007)7)"));

	}

	@Test
	public void testCase128(){

	assertTrue(jBObj.bondRegex("(007)7007)"));

	}

	@Test
	public void testCase129(){

	assertTrue(jBObj.bondRegex("(007)707)"));

	}

	@Test
	public void testCase130(){

	assertTrue(jBObj.bondRegex("(007)77)"));

	}

	@Test
	public void testCase131(){

	assertTrue(jBObj.bondRegex("(007)8("));

	}

	@Test
	public void testCase132(){

	assertTrue(jBObj.bondRegex("(007)8)"));

	}

	@Test
	public void testCase133(){

	assertTrue(jBObj.bondRegex("(007)8007)"));

	}

	@Test
	public void testCase134(){

	assertTrue(jBObj.bondRegex("(007)807)"));

	}

	@Test
	public void testCase135(){

	assertTrue(jBObj.bondRegex("(007)87)"));

	}

	@Test
	public void testCase136(){

	assertTrue(jBObj.bondRegex("(007)9("));

	}

	@Test
	public void testCase137(){

	assertTrue(jBObj.bondRegex("(007)9)"));

	}

	@Test
	public void testCase138(){

	assertTrue(jBObj.bondRegex("(007)9007)"));

	}

	@Test
	public void testCase139(){

	assertTrue(jBObj.bondRegex("(007)907)"));

	}

	@Test
	public void testCase140(){

	assertTrue(jBObj.bondRegex("(007)97)"));

	}

	@Test
	public void testCase141(){

	assertFalse(jBObj.bondRegex("(0070("));

	}

	@Test
	public void testCase142(){

	assertTrue(jBObj.bondRegex("(0070)"));

	}

	@Test
	public void testCase143(){

	assertTrue(jBObj.bondRegex("(0070007)"));

	}

	@Test
	public void testCase144(){

	assertTrue(jBObj.bondRegex("(007007)"));

	}

	@Test
	public void testCase145(){

	assertTrue(jBObj.bondRegex("(00707)"));

	}

	@Test
	public void testCase146(){

	assertFalse(jBObj.bondRegex("(0071("));

	}

	@Test
	public void testCase147(){

	assertTrue(jBObj.bondRegex("(0071)"));

	}

	@Test
	public void testCase148(){

	assertTrue(jBObj.bondRegex("(0071007)"));

	}

	@Test
	public void testCase149(){

	assertTrue(jBObj.bondRegex("(007107)"));

	}

	@Test
	public void testCase150(){

	assertTrue(jBObj.bondRegex("(00717)"));

	}

	@Test
	public void testCase151(){

	assertFalse(jBObj.bondRegex("(0072("));

	}

	@Test
	public void testCase152(){

	assertTrue(jBObj.bondRegex("(0072)"));

	}

	@Test
	public void testCase153(){

	assertTrue(jBObj.bondRegex("(0072007)"));

	}

	@Test
	public void testCase154(){

	assertTrue(jBObj.bondRegex("(007207)"));

	}

	@Test
	public void testCase155(){

	assertTrue(jBObj.bondRegex("(00727)"));

	}

	@Test
	public void testCase156(){

	assertFalse(jBObj.bondRegex("(0073("));

	}

	@Test
	public void testCase157(){

	assertTrue(jBObj.bondRegex("(0073)"));

	}

	@Test
	public void testCase158(){

	assertTrue(jBObj.bondRegex("(0073007)"));

	}

	@Test
	public void testCase159(){

	assertTrue(jBObj.bondRegex("(007307)"));

	}

	@Test
	public void testCase160(){

	assertTrue(jBObj.bondRegex("(00737)"));

	}

	@Test
	public void testCase161(){

	assertFalse(jBObj.bondRegex("(0074("));

	}

	@Test
	public void testCase162(){

	assertTrue(jBObj.bondRegex("(0074)"));

	}

	@Test
	public void testCase163(){

	assertTrue(jBObj.bondRegex("(0074007)"));

	}

	@Test
	public void testCase164(){

	assertTrue(jBObj.bondRegex("(007407)"));

	}

	@Test
	public void testCase165(){

	assertTrue(jBObj.bondRegex("(00747)"));

	}

	@Test
	public void testCase166(){

	assertFalse(jBObj.bondRegex("(0075("));

	}

	@Test
	public void testCase167(){

	assertTrue(jBObj.bondRegex("(0075)"));

	}

	@Test
	public void testCase168(){

	assertTrue(jBObj.bondRegex("(0075007)"));

	}

	@Test
	public void testCase169(){

	assertTrue(jBObj.bondRegex("(007507)"));

	}

	@Test
	public void testCase170(){

	assertTrue(jBObj.bondRegex("(00757)"));

	}

	@Test
	public void testCase171(){

	assertFalse(jBObj.bondRegex("(0076("));

	}

	@Test
	public void testCase172(){

	assertTrue(jBObj.bondRegex("(0076)"));

	}

	@Test
	public void testCase173(){

	assertTrue(jBObj.bondRegex("(0076007)"));

	}

	@Test
	public void testCase174(){

	assertTrue(jBObj.bondRegex("(007607)"));

	}

	@Test
	public void testCase175(){

	assertTrue(jBObj.bondRegex("(00767)"));

	}

	@Test
	public void testCase176(){

	assertFalse(jBObj.bondRegex("(0077("));

	}

	@Test
	public void testCase177(){

	assertTrue(jBObj.bondRegex("(0077)"));

	}

	@Test
	public void testCase178(){

	assertTrue(jBObj.bondRegex("(0077007)"));

	}

	@Test
	public void testCase179(){

	assertTrue(jBObj.bondRegex("(007707)"));

	}

	@Test
	public void testCase180(){

	assertTrue(jBObj.bondRegex("(00777)"));

	}

	@Test
	public void testCase181(){

	assertFalse(jBObj.bondRegex("(0078("));

	}

	@Test
	public void testCase182(){

	assertTrue(jBObj.bondRegex("(0078)"));

	}

	@Test
	public void testCase183(){

	assertTrue(jBObj.bondRegex("(0078007)"));

	}

	@Test
	public void testCase184(){

	assertTrue(jBObj.bondRegex("(007807)"));

	}

	@Test
	public void testCase185(){

	assertTrue(jBObj.bondRegex("(00787)"));

	}

	@Test
	public void testCase186(){

	assertFalse(jBObj.bondRegex("(0079("));

	}

	@Test
	public void testCase187(){

	assertTrue(jBObj.bondRegex("(0079)"));

	}

	@Test
	public void testCase188(){

	assertTrue(jBObj.bondRegex("(0079007)"));

	}

	@Test
	public void testCase189(){

	assertTrue(jBObj.bondRegex("(007907)"));

	}

	@Test
	public void testCase190(){

	assertTrue(jBObj.bondRegex("(00797)"));

	}

	@Test
	public void testCase191(){

	assertFalse(jBObj.bondRegex("(008("));

	}

	@Test
	public void testCase192(){

	assertFalse(jBObj.bondRegex("(008)"));

	}

	@Test
	public void testCase193(){

	assertTrue(jBObj.bondRegex("(008007)"));

	}

	@Test
	public void testCase194(){

	assertFalse(jBObj.bondRegex("(00807)"));

	}

	@Test
	public void testCase195(){

	assertFalse(jBObj.bondRegex("(0087)"));

	}

	@Test
	public void testCase196(){

	assertFalse(jBObj.bondRegex("(009("));

	}

	@Test
	public void testCase197(){

	assertFalse(jBObj.bondRegex("(009)"));

	}

	@Test
	public void testCase198(){

	assertTrue(jBObj.bondRegex("(009007)"));

	}

	@Test
	public void testCase199(){

	assertFalse(jBObj.bondRegex("(00907)"));

	}

	@Test
	public void testCase200(){

	assertFalse(jBObj.bondRegex("(0097)"));

	}

	@Test
	public void testCase201(){

	assertFalse(jBObj.bondRegex("(01("));

	}

	@Test
	public void testCase202(){

	assertFalse(jBObj.bondRegex("(01)"));

	}

	@Test
	public void testCase203(){

	assertTrue(jBObj.bondRegex("(01007)"));

	}

	@Test
	public void testCase204(){

	assertFalse(jBObj.bondRegex("(0107)"));

	}

	@Test
	public void testCase205(){

	assertFalse(jBObj.bondRegex("(017)"));

	}

	@Test
	public void testCase206(){

	assertFalse(jBObj.bondRegex("(02("));

	}

	@Test
	public void testCase207(){

	assertFalse(jBObj.bondRegex("(02)"));

	}

	@Test
	public void testCase208(){

	assertTrue(jBObj.bondRegex("(02007)"));

	}

	@Test
	public void testCase209(){

	assertFalse(jBObj.bondRegex("(0207)"));

	}

	@Test
	public void testCase210(){

	assertFalse(jBObj.bondRegex("(027)"));

	}

	@Test
	public void testCase211(){

	assertFalse(jBObj.bondRegex("(03("));

	}

	@Test
	public void testCase212(){

	assertFalse(jBObj.bondRegex("(03)"));

	}

	@Test
	public void testCase213(){

	assertTrue(jBObj.bondRegex("(03007)"));

	}

	@Test
	public void testCase214(){

	assertFalse(jBObj.bondRegex("(0307)"));

	}

	@Test
	public void testCase215(){

	assertFalse(jBObj.bondRegex("(037)"));

	}

	@Test
	public void testCase216(){

	assertFalse(jBObj.bondRegex("(04("));

	}

	@Test
	public void testCase217(){

	assertFalse(jBObj.bondRegex("(04)"));

	}

	@Test
	public void testCase218(){

	assertTrue(jBObj.bondRegex("(04007)"));

	}

	@Test
	public void testCase219(){

	assertFalse(jBObj.bondRegex("(0407)"));

	}

	@Test
	public void testCase220(){

	assertFalse(jBObj.bondRegex("(047)"));

	}

	@Test
	public void testCase221(){

	assertFalse(jBObj.bondRegex("(05("));

	}

	@Test
	public void testCase222(){

	assertFalse(jBObj.bondRegex("(05)"));

	}

	@Test
	public void testCase223(){

	assertTrue(jBObj.bondRegex("(05007)"));

	}

	@Test
	public void testCase224(){

	assertFalse(jBObj.bondRegex("(0507)"));

	}

	@Test
	public void testCase225(){

	assertFalse(jBObj.bondRegex("(057)"));

	}

	@Test
	public void testCase226(){

	assertFalse(jBObj.bondRegex("(06("));

	}

	@Test
	public void testCase227(){

	assertFalse(jBObj.bondRegex("(06)"));

	}

	@Test
	public void testCase228(){

	assertTrue(jBObj.bondRegex("(06007)"));

	}

	@Test
	public void testCase229(){

	assertFalse(jBObj.bondRegex("(0607)"));

	}

	@Test
	public void testCase230(){

	assertFalse(jBObj.bondRegex("(067)"));

	}

	@Test
	public void testCase231(){

	assertFalse(jBObj.bondRegex("(07("));

	}

	@Test
	public void testCase232(){

	assertFalse(jBObj.bondRegex("(07)"));

	}

	@Test
	public void testCase233(){

	assertTrue(jBObj.bondRegex("(07007)"));

	}

	@Test
	public void testCase234(){

	assertFalse(jBObj.bondRegex("(0707)"));

	}

	@Test
	public void testCase235(){

	assertFalse(jBObj.bondRegex("(077)"));

	}

	@Test
	public void testCase236(){

	assertFalse(jBObj.bondRegex("(08("));

	}

	@Test
	public void testCase237(){

	assertFalse(jBObj.bondRegex("(08)"));

	}

	@Test
	public void testCase238(){

	assertTrue(jBObj.bondRegex("(08007)"));

	}

	@Test
	public void testCase239(){

	assertFalse(jBObj.bondRegex("(0807)"));

	}

	@Test
	public void testCase240(){

	assertFalse(jBObj.bondRegex("(087)"));

	}

	@Test
	public void testCase241(){

	assertFalse(jBObj.bondRegex("(09("));

	}

	@Test
	public void testCase242(){

	assertFalse(jBObj.bondRegex("(09)"));

	}

	@Test
	public void testCase243(){

	assertTrue(jBObj.bondRegex("(09007)"));

	}

	@Test
	public void testCase244(){

	assertFalse(jBObj.bondRegex("(0907)"));

	}

	@Test
	public void testCase245(){

	assertFalse(jBObj.bondRegex("(097)"));

	}

	@Test
	public void testCase246(){

	assertFalse(jBObj.bondRegex("(1("));

	}

	@Test
	public void testCase247(){

	assertFalse(jBObj.bondRegex("(1)"));

	}

	@Test
	public void testCase248(){

	assertTrue(jBObj.bondRegex("(1007)"));

	}

	@Test
	public void testCase249(){

	assertFalse(jBObj.bondRegex("(107)"));

	}

	@Test
	public void testCase250(){

	assertFalse(jBObj.bondRegex("(17)"));

	}

	@Test
	public void testCase251(){

	assertFalse(jBObj.bondRegex("(2("));

	}

	@Test
	public void testCase252(){

	assertFalse(jBObj.bondRegex("(2)"));

	}

	@Test
	public void testCase253(){

	assertTrue(jBObj.bondRegex("(2007)"));

	}

	@Test
	public void testCase254(){

	assertFalse(jBObj.bondRegex("(207)"));

	}

	@Test
	public void testCase255(){

	assertFalse(jBObj.bondRegex("(27)"));

	}

	@Test
	public void testCase256(){

	assertFalse(jBObj.bondRegex("(3("));

	}

	@Test
	public void testCase257(){

	assertFalse(jBObj.bondRegex("(3)"));

	}

	@Test
	public void testCase258(){

	assertTrue(jBObj.bondRegex("(3007)"));

	}

	@Test
	public void testCase259(){

	assertFalse(jBObj.bondRegex("(307)"));

	}

	@Test
	public void testCase260(){

	assertFalse(jBObj.bondRegex("(37)"));

	}

	@Test
	public void testCase261(){

	assertFalse(jBObj.bondRegex("(4("));

	}

	@Test
	public void testCase262(){

	assertFalse(jBObj.bondRegex("(4)"));

	}

	@Test
	public void testCase263(){

	assertTrue(jBObj.bondRegex("(4007)"));

	}

	@Test
	public void testCase264(){

	assertFalse(jBObj.bondRegex("(407)"));

	}

	@Test
	public void testCase265(){

	assertFalse(jBObj.bondRegex("(47)"));

	}

	@Test
	public void testCase266(){

	assertFalse(jBObj.bondRegex("(5("));

	}

	@Test
	public void testCase267(){

	assertFalse(jBObj.bondRegex("(5)"));

	}

	@Test
	public void testCase268(){

	assertTrue(jBObj.bondRegex("(5007)"));

	}

	@Test
	public void testCase269(){

	assertFalse(jBObj.bondRegex("(507)"));

	}

	@Test
	public void testCase270(){

	assertFalse(jBObj.bondRegex("(57)"));

	}

	@Test
	public void testCase271(){

	assertFalse(jBObj.bondRegex("(6("));

	}

	@Test
	public void testCase272(){

	assertFalse(jBObj.bondRegex("(6)"));

	}

	@Test
	public void testCase273(){

	assertTrue(jBObj.bondRegex("(6007)"));

	}

	@Test
	public void testCase274(){

	assertFalse(jBObj.bondRegex("(607)"));

	}

	@Test
	public void testCase275(){

	assertFalse(jBObj.bondRegex("(67)"));

	}

	@Test
	public void testCase276(){

	assertFalse(jBObj.bondRegex("(7("));

	}

	@Test
	public void testCase277(){

	assertFalse(jBObj.bondRegex("(7)"));

	}

	@Test
	public void testCase278(){

	assertTrue(jBObj.bondRegex("(7007)"));

	}

	@Test
	public void testCase279(){

	assertFalse(jBObj.bondRegex("(707)"));

	}

	@Test
	public void testCase280(){

	assertFalse(jBObj.bondRegex("(77)"));

	}

	@Test
	public void testCase281(){

	assertFalse(jBObj.bondRegex("(8("));

	}

	@Test
	public void testCase282(){

	assertFalse(jBObj.bondRegex("(8)"));

	}

	@Test
	public void testCase283(){

	assertTrue(jBObj.bondRegex("(8007)"));

	}

	@Test
	public void testCase284(){

	assertFalse(jBObj.bondRegex("(807)"));

	}

	@Test
	public void testCase285(){

	assertFalse(jBObj.bondRegex("(87)"));

	}

	@Test
	public void testCase286(){

	assertFalse(jBObj.bondRegex("(9("));

	}

	@Test
	public void testCase287(){

	assertFalse(jBObj.bondRegex("(9)"));

	}

	@Test
	public void testCase288(){

	assertTrue(jBObj.bondRegex("(9007)"));

	}

	@Test
	public void testCase289(){

	assertFalse(jBObj.bondRegex("(907)"));

	}

	@Test
	public void testCase290(){

	assertFalse(jBObj.bondRegex("(97)"));

	}

	@Test
	public void testCase291(){

	assertFalse(jBObj.bondRegex(")"));

	}

	@Test
	public void testCase292(){

	assertFalse(jBObj.bondRegex(")("));

	}

	@Test
	public void testCase293(){

	assertFalse(jBObj.bondRegex("))"));

	}

	@Test
	public void testCase294(){

	assertFalse(jBObj.bondRegex(")007)"));

	}

	@Test
	public void testCase295(){

	assertFalse(jBObj.bondRegex(")07)"));

	}

	@Test
	public void testCase296(){

	assertFalse(jBObj.bondRegex(")7)"));

	}

	@Test
	public void testCase297(){

	assertFalse(jBObj.bondRegex("0("));

	}

	@Test
	public void testCase298(){

	assertFalse(jBObj.bondRegex("0)"));

	}

	@Test
	public void testCase299(){

	assertFalse(jBObj.bondRegex("0007)"));

	}

	@Test
	public void testCase300(){

	assertFalse(jBObj.bondRegex("007)"));

	}

	@Test
	public void testCase301(){

	assertFalse(jBObj.bondRegex("07)"));

	}

	@Test
	public void testCase302(){

	assertFalse(jBObj.bondRegex("1("));

	}

	@Test
	public void testCase303(){

	assertFalse(jBObj.bondRegex("1)"));

	}

	@Test
	public void testCase304(){

	assertFalse(jBObj.bondRegex("1007)"));

	}

	@Test
	public void testCase305(){

	assertFalse(jBObj.bondRegex("107)"));

	}

	@Test
	public void testCase306(){

	assertFalse(jBObj.bondRegex("17)"));

	}

	@Test
	public void testCase307(){

	assertFalse(jBObj.bondRegex("2("));

	}

	@Test
	public void testCase308(){

	assertFalse(jBObj.bondRegex("2)"));

	}

	@Test
	public void testCase309(){

	assertFalse(jBObj.bondRegex("2007)"));

	}

	@Test
	public void testCase310(){

	assertFalse(jBObj.bondRegex("207)"));

	}

	@Test
	public void testCase311(){

	assertFalse(jBObj.bondRegex("27)"));

	}

	@Test
	public void testCase312(){

	assertFalse(jBObj.bondRegex("3("));

	}

	@Test
	public void testCase313(){

	assertFalse(jBObj.bondRegex("3)"));

	}

	@Test
	public void testCase314(){

	assertFalse(jBObj.bondRegex("3007)"));

	}

	@Test
	public void testCase315(){

	assertFalse(jBObj.bondRegex("307)"));

	}

	@Test
	public void testCase316(){

	assertFalse(jBObj.bondRegex("37)"));

	}

	@Test
	public void testCase317(){

	assertFalse(jBObj.bondRegex("4("));

	}

	@Test
	public void testCase318(){

	assertFalse(jBObj.bondRegex("4)"));

	}

	@Test
	public void testCase319(){

	assertFalse(jBObj.bondRegex("4007)"));

	}

	@Test
	public void testCase320(){

	assertFalse(jBObj.bondRegex("407)"));

	}

	@Test
	public void testCase321(){

	assertFalse(jBObj.bondRegex("47)"));

	}

	@Test
	public void testCase322(){

	assertFalse(jBObj.bondRegex("5("));

	}

	@Test
	public void testCase323(){

	assertFalse(jBObj.bondRegex("5)"));

	}

	@Test
	public void testCase324(){

	assertFalse(jBObj.bondRegex("5007)"));

	}

	@Test
	public void testCase325(){

	assertFalse(jBObj.bondRegex("507)"));

	}

	@Test
	public void testCase326(){

	assertFalse(jBObj.bondRegex("57)"));

	}

	@Test
	public void testCase327(){

	assertFalse(jBObj.bondRegex("6("));

	}

	@Test
	public void testCase328(){

	assertFalse(jBObj.bondRegex("6)"));

	}

	@Test
	public void testCase329(){

	assertFalse(jBObj.bondRegex("6007)"));

	}

	@Test
	public void testCase330(){

	assertFalse(jBObj.bondRegex("607)"));

	}

	@Test
	public void testCase331(){

	assertFalse(jBObj.bondRegex("67)"));

	}

	@Test
	public void testCase332(){

	assertFalse(jBObj.bondRegex("7("));

	}

	@Test
	public void testCase333(){

	assertFalse(jBObj.bondRegex("7)"));

	}

	@Test
	public void testCase334(){

	assertFalse(jBObj.bondRegex("7007)"));

	}

	@Test
	public void testCase335(){

	assertFalse(jBObj.bondRegex("707)"));

	}

	@Test
	public void testCase336(){

	assertFalse(jBObj.bondRegex("77)"));

	}

	@Test
	public void testCase337(){

	assertFalse(jBObj.bondRegex("8("));

	}

	@Test
	public void testCase338(){

	assertFalse(jBObj.bondRegex("8)"));

	}

	@Test
	public void testCase339(){

	assertFalse(jBObj.bondRegex("8007)"));

	}

	@Test
	public void testCase340(){

	assertFalse(jBObj.bondRegex("807)"));

	}

	@Test
	public void testCase341(){

	assertFalse(jBObj.bondRegex("87)"));

	}

	@Test
	public void testCase342(){

	assertFalse(jBObj.bondRegex("9("));

	}

	@Test
	public void testCase343(){

	assertFalse(jBObj.bondRegex("9)"));

	}

	@Test
	public void testCase344(){

	assertFalse(jBObj.bondRegex("9007)"));

	}

	@Test
	public void testCase345(){

	assertFalse(jBObj.bondRegex("907)"));

	}

	@Test
	public void testCase346(){

	assertFalse(jBObj.bondRegex("97)"));

	}


}
