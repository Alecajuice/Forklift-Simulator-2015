package graphics;

public class Transformations {

	public static Vector xYRot(Vector vec, double radians) {
		double[] matrix = {
				Math.cos(radians), -Math.sin(radians), 0,
				Math.sin(radians), Math.cos(radians), 0,
				0, 0, 0
		};
		
		double newX = vec.getX()*matrix[0] + vec.getX()*matrix[3] + vec.getX()*matrix[6];
		double newY = vec.getY()*matrix[1] + vec.getY()*matrix[4] + vec.getY()*matrix[7];
		double newZ = vec.getZ()*matrix[2] + vec.getZ()*matrix[5] + vec.getZ()*matrix[8];
		
		return new Vector((int)newX, (int)newY, (int)newZ);
	}
}
