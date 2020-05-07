interface ClickListener {
    void onClick(String str)
}

interface FocusChangeListener {
    void gainFocus(int id)

    void loseFocus(int id)
}

class Button {

    ClickListener clickListener

    FocusChangeListener focusChangeListener

    def setOnClickListener(ClickListener clickListener) {
        this.onClickListener = clickListener
    }

    def actionClick(String str) {
        clickListener?.onClick(str)
    }

    def setOnFocusChangeListener(FocusChangeListener focusChangeListener){
        this.focusChangeListener=focusChangeListener
    }

    def actionFoucus(int id){
        focusChangeListener?.gainFocus(id)
        focusChangeListener?.loseFocus(id)
    }
}

def button = new Button()
button.setClickListener { println it }
button.actionClick("666")
focuslistener=[gainFocus:{ println "${it}获得焦点"},
               loseFocus:{ println "${it}失去焦点"}]
button.setFocusChangeListener(focuslistener as FocusChangeListener)
button.actionFoucus(6)


