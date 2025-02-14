package fr.androidmakers.store.model

class Agenda(
    val sessions: Map<String, Session>,
    val slots: List<ScheduleSlot>,
    val rooms: Map<String, Room>,
    val speakers: Map<String, Speaker>
)