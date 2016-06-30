package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

public interface IBoard {
	public boolean checkIsFullyFilled();
	public boolean placeMark(IPosition position, Sign value);
	public Sign elementAt(IPosition position);
	public boolean checkIsEmptyAt(IPosition position);
}
