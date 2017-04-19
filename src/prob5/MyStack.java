package prob5;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int i) {
		top = -1;
		buffer = new String[i];
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public String[] getBuffer() {
		return buffer;
	}

	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}

	public void push(String s) {

		if (top + 1 >= buffer.length) {
			String[] temp = new String[buffer.length];
			for (int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}

			buffer = new String[top + 2];
			for (int i = 0; i < temp.length; i++) {
				buffer[i] = temp[i];
			}
			top++;
			buffer[top] = s;
		} else {
			top++;
			buffer[top] = s;
		}
	}

	public String pop() throws MyStackException {
		if (top <= -1) {
			throw new MyStackException();
		} else {
			String s = buffer[top];
			top--;
			return s;
		}

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top < -1) {
			return true;
		} else {
			return false;
		}
	}

}
