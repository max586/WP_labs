package Observer;

import ChainOfResponsibility.Controls;

public record MouseState(boolean isClicked, Controls clickedObj) {
}
