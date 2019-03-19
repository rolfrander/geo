package org.pvv.rolfn.geo;

import static org.junit.Assert.*;

import org.junit.Test;

public class UTMTest {

	@Test
	public void brazil() {
		assertEquals("2.0S 77.0W", new WGS84( new UTM(new WGS84(-2,-77))).toString());
	}

	public void norway() {
		assertEquals("60.0N 11E", new WGS84( new UTM(new WGS84(60,11))).toString());
	}
}
