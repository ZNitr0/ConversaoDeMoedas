package br.com.logs;

import java.time.LocalDateTime;

public record Logs(String coinBase, String coinTarget, Double amount, Double conversion, LocalDateTime dateHour) {
}