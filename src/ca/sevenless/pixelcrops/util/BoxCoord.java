package ca.sevenless.pixelcrops.util;

public class BoxCoord {
	
	private Coord TL;
	private Coord BR;
	
	public BoxCoord( Coord _TL, Coord _BR){
		setTL(_TL);
		setBR(_BR); 
	}
	
	public BoxCoord(int x1, int y1, int x2, int y2){
		setTL(new Coord(x1,y1));
		setBR(new Coord(x2,y2));
	}

	public Coord getTL() {
		return TL;
	}

	public void setTL(Coord tL) {
		TL = tL;
	}

	public Coord getBR() {
		return BR;
	}

	public void setBR(Coord bR) {
		BR = bR;
	}
}
