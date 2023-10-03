package decoratorPattern;

class WidgetDecorator implements PageComponent {
    private PageComponent page;
    private int widgetRank;

    public WidgetDecorator(PageComponent page, String widgetName, int widgetRank) {
        this.page = page;
        this.widgetRank = widgetRank;
    }

    @Override
    public int calculateRank() {
        return page.calculateRank() + widgetRank;
    }
}
