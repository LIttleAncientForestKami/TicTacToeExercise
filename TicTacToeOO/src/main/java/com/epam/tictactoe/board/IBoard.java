package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

/**
 * @author Grzegorz Sledz
 */
public interface IBoard {
	public boolean checkIsFullyFilled();
	public boolean placeMark(IPosition position, Sign value);
	public Sign elementAt(IPosition position);
	public boolean checkIsEmptyAt(IPosition position);
	public IDimension dimension();
}
