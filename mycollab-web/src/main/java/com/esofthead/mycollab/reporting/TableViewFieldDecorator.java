/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.reporting;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;

import com.esofthead.mycollab.vaadin.ui.table.TableViewField;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 * 
 */
public class TableViewFieldDecorator extends TableViewField {
	private TableViewField tableField;

	private ComponentBuilder componentBuilder;

	public TableViewFieldDecorator(TableViewField tableField) {
		this.tableField = tableField;
	}

	@Override
	public String getDesc() {
		return tableField.getDesc();
	}

	@Override
	public String getField() {
		return tableField.getField();
	}

	@Override
	public void setField(String field) {
		tableField.setField(field);
	}

	@Override
	public int getDefaultWidth() {
		return tableField.getDefaultWidth();
	}

	@Override
	public void setDefaultWidth(int defaultWidth) {
		tableField.setDefaultWidth(defaultWidth);
	}

	public ComponentBuilder getComponentBuilder() {
		if (componentBuilder == null) {
			componentBuilder = cmp.text(
					new StringExpression(tableField.getField()))
					.setWidth(tableField.getDefaultWidth());
		}
		return componentBuilder;
	}

	public void setComponentBuilder(ComponentBuilder componentBuilder) {
		this.componentBuilder = componentBuilder;
	}
}
