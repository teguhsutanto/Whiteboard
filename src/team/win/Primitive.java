package team.win;

import java.io.Serializable;
import java.util.List;

public class Primitive implements Serializable {
	private static final long serialVersionUID = 5479603618265015319L;

	List <Point> mPoints;
	float mStrokeWidth;
	int mColor;
	public Primitive(float strokeWidth, int color, List<Point> points) {
		mStrokeWidth = strokeWidth;
		mColor = color & 0x00FFFFFF;
		mPoints = points;
	}
}
