package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest {
	/**
	 * 
	 * @return
	 */
	protected String createOrderBody() {
		//@formatter:off
		return "{\n"
        + "  \"customer\":\"ATTAWAY_HECKTOR\",\n"
        + "  \"model\":\"CHEROKEE\",\n"
        + "  \"trim\":\"Latitude\",\n"
        + "  \"doors\":4,\n"
        + "  \"color\":\"EXT_DIAMOND_BLACK\",\n"
        + "  \"engine\":\"6_4_GAS\",\n"
        + "  \"tire\":\"33_FALKEN\",\n"
        + "  \"options\":[\n"
        + "    \"EXT_MOPAR_STEP_BLACK\",\n"
        + "    \"EXT_AEV_LIFT\",\n"
        + "    \"WHEEL_QUAD_MOAB\",\n"
        + "    \"EXT_WARN_BUMPER_FRONT\",\n"
        + "    \"EXT_WARN_BUMPER_REAR\",\n"
        + "    \"EXT_ARB_COMPRESSOR\"\n"
        + "  ]\n"
        + "}";
		//@formatter:on
	}
}
